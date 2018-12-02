#include "gato.h"

std::ostream &operator<<(std::ostream &o, const gato &g){
    o << "Gato: " << g.idade() << ", " << g.nome();
    return o;
}