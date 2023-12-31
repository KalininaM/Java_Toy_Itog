package model;


/**
 * Интерфейс, имитирующий розыгрыш.
 */
public interface ToyMachineInterface {

    void put(String name);

    void letsFun();

    Toy getToy();

    void getAllToys();

    void write(String name);
}