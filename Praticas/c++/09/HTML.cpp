#include <string>
#include <vector>
#include <iostream>

class PageElement {
public:
    virtual std::string render() =0;
};

class Span: public PageElement {
public:
    virtual std::string render(){
        return "<span>TEXT</span>";
    }
};

class Image: public PageElement {
public:
    virtual std::string render(){
        return "<img src=\"IMG\"/>";
    }
};

class Composite: public PageElement{
private:
    std::vector<PageElement*> _elements = std::vector<PageElement*>();
public:
    virtual std::string render(){
        std::string s;
        for(PageElement* p: _elements){
            s+=p->render() + "\n";
        }
        return s;
    }
    void addElement(PageElement *p){
        _elements.push_back(p);
    }
};

class Paragraph: public Composite{
public:
    virtual std::string render(){
        std::string s = "<p>\n";
        s+=Composite::render() + "</p>";
        return s;
    }
};

class Page: public Composite {
public:
    virtual std::string render(){
        std::string s = "<page>\n";
        s+= Composite::render() + "</page>";
        return s;
    }    
};

int main(){

    Page p;
    Paragraph paragraph1;
    Paragraph paragraph2;
    Span s1;
    Span s2;
    Image i1;

    paragraph1.addElement(&s1);
    paragraph1.addElement(&s2);

    paragraph2.addElement(&i1);

    p.addElement(&paragraph1);
    p.addElement(&paragraph2);

    std::cout << p.render() << std::endl;

    return 0;
}