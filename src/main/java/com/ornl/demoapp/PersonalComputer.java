package com.ornl.demoapp;

/**
 * @author btomar
 * The Composite class for a Personal Computer
 */
public class PersonalComputer {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    private Processor processor;
    private Memory memory;
    private Storage storage;
    private Double totalPrice;

    public PersonalComputer(Case theCase, Monitor monitor, Motherboard motherboard, Processor processor, Memory memory, Storage storage) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    /**
     *
     * @return Stringified PersonalComputer Object contents
     */
    @Override
    public String toString() {
        return "PersonalComputer{" +
                "theCase=" + theCase +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                ", processor=" + processor +
                ", memory=" + memory +
                ", storage=" + storage +
                '}';
    }

    public Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     *
     * @return Double totalPrice of the components
     */
    public Double getTotalPrice() {
        Double totalPrice = this.memory.getPrice() + this.monitor.getPrice() + this.motherboard.getPrice() + this.processor.getPrice() + this.storage.getPrice() + this.theCase.getPrice();
        return totalPrice;
    }
}
