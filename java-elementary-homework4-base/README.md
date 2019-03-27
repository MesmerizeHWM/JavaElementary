# Домашнее задание № 4

  1. Сделать FORK с текущего репозитория в свой аккаунт
  2. Сделать классы-наследники класса Worker и добавить в них свойства:
        * класс Manager: добавить свойства String project, int expirience
        * класс Programmer: добавить свойства String language, String rate;
        * класс QAEngeneer: добавить свойство boolean automationQA;

  3. В каждом из классов-наследников переопределить метод getWorkerPosition

  4. В класс WorkerInfoStore добавить 3 private свойства
        * Manager [] managers;
        * Programmer [] programmers
        * QAEngeneer[] qaEngeneers;

5. В класс WorkerInfoStore добавить и реализовать следущие методы:
```
    //добавить в массив managers
    public void add(Manager worker);

    //добавить в массив programmers
    public void add(Programmer worker);

    //добавить в массив qaEngeneers
    public void add(QAEngeneer worker);

    /**
    * В этом методе проанализировать тип worker - с помощью instanceof.
    * Если тип - Manager - добавить в массив managers
    * Если тип - Programmer - добавить в массив managers
    * Если тип - QAEngeneer - добавить в массив qaEngeneers
    **/
    public void add(Worker worker);
```
6. Сделать чтобы класс WorkerInfoStore реализовывал паттерн Singleton.