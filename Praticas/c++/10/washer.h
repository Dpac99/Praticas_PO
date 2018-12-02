class MachineState;

class Machine{
private:
    MachineState *_state;
public:
    Machine();
    void power();
    void closed();
    void tick();
    void open();
    void setState(MachineState *state);
    ~Machine();
};

class MachineState{
protected:
    Machine *_machine;
public:
    //By default, none of them do anything;
    virtual void power(){}
    virtual void closed(){}
    virtual void tick(){}
    virtual void open(){};
};

class MachineOffClosedState: public MachineState{
public:
    MachineOffClosedState(Machine *machine);
    virtual void power() override;
};

class MachineOffOpenState: public MachineState{
public:
    MachineOffOpenState(Machine *machine);
    virtual void closed() override;
};

class MachineOnState: public MachineState{
private:
    int _ticks=0;
public:
    MachineOnState(Machine *machine);
    virtual void tick() override;
    virtual void power() override;
};

class MachineAfterWashState: public MachineState{
private:
    int _ticks = 0;
public:
    MachineAfterWashState(Machine *machine);
    virtual void tick() override;
    virtual void open() override;
    virtual void power() override;
};