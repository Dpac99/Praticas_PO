#ifndef __GATO_H__
#define __GATO_H__

#include <string>
#include <iostream>

class gato {
    int _idade{10};                                                                                                    //Chamada ao construtor de int com valor 10
    std::string _nome{"Tareco"};                                                                                       //Chamada ao construtor de string com valor "Tareco"
public:
    gato() = default;                                                                                                  //Default constructor
    virtual ~gato() = default;                                                                                         //Default destructor but virtual
    gato(int idade, std::string nome): _idade(idade), _nome(nome) {} 
    gato(gato &g){}                                                                                                    //Constructor por shallow copy
    gato(gato &&g){}                                                                                                   //Constructor por right value
    inline int idade() const { return _idade; }
    inline std::string &nome() const { return _nome;}


};

std::ostream &operator<<(std::ostream &o, const gato &g);
#endif