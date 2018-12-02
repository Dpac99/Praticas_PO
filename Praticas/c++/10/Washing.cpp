#include <iostream>
#include "washer.h"

//class Machine:

Machine::Machine(){
    _state = new MachineOffClosedState(this);
}
void Machine::power(){
    _state->power();
}
void Machine::closed(){
    std::cout << "Door is closing" << std::endl;
    _state->closed();
}
void Machine::tick(){
    _state->tick();
}
void Machine::open(){
    std::cout << "Door is opening" << std::endl;
    _state->open();
}
void Machine::setState(MachineState* state){
    delete _state;
    _state = state;
}
Machine::~Machine(){
    delete _state;
}

//class MachineState has nothing to be defined

//class MachineOffClosedState

MachineOffClosedState::MachineOffClosedState(Machine* machine){
    _machine=machine;
}
void MachineOffClosedState::power() {
    _machine->setState(new MachineOnState(_machine));
}

//class MachineOffOpenState

MachineOffOpenState::MachineOffOpenState(Machine *machine){
    _machine = machine;
}

void MachineOffOpenState::closed(){
    _machine->setState(new MachineOffClosedState(_machine));
}

//class MachineOnState

MachineOnState::MachineOnState(Machine *machine){
    _machine = machine;
}

void MachineOnState::tick(){
    if(_ticks < 5400){
        _ticks++;
    }
    else{
        _machine->setState(new MachineAfterWashState(_machine));
    }
}

void MachineOnState::power(){
    _machine->setState(new MachineAfterWashState(_machine));;
}

//class MachineAfterWashState

MachineAfterWashState::MachineAfterWashState(Machine *machine){
    _machine = machine;
}

void MachineAfterWashState::tick(){
    if(_ticks < 120){
        _ticks++;
    }
}

void MachineAfterWashState::open(){
    if(_ticks >= 120){
        _machine->setState(new MachineOffOpenState(_machine));
    }
}

void MachineAfterWashState::power(){
    if(_ticks >= 120){
        _machine->setState(new MachineOnState(_machine));
    }
}

int main(){

    Machine mach;
    int i;

    mach.closed();
    mach.power();
    std::cout<<"Washing..."<<std::endl;
    for(i=0; i<5400; i++){
        mach.tick();
    }
    std::cout << "Done washing, please wait a bit" << std::endl;
    for(i=0; i<120; i++){
        mach.tick();
    }
    std::cout << "You can now open the door" << std::endl;

    mach.open();

    return 0;
}

