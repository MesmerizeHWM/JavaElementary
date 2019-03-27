package org.app.woker.application;

import org.app.woker.entities.Manager;
import org.app.woker.entities.Programmer;
import org.app.woker.entities.QAEngineer;
import org.app.woker.entities.Worker;


public final class WorkerInfoStore {

    private static final WorkerInfoStore infoStore = new WorkerInfoStore();

    private static final int INITIAL_ARRAY_SIZE = 1;
    private static final int LENGTH_EXTEND_FACTOR = 2;

    private int managersIndex;
    private int programmersIndex;
    private int qaEngineersIndex;


    private Worker[] managers = new Manager[INITIAL_ARRAY_SIZE];
    private Worker[] programmers = new Programmer[INITIAL_ARRAY_SIZE];
    private Worker[] qaEngineers = new QAEngineer[INITIAL_ARRAY_SIZE];

    private WorkerInfoStore() {
    }

    public static WorkerInfoStore getInfoStoreSingleton() {
        return infoStore;
    }

    public void add(Manager manager) {
        if (managers.length <= managersIndex) {
            managers = extendArrayLength(managers);
        }
        managers[managersIndex] = manager;
        managersIndex += 1;
    }

    public void add(Programmer programmer) {
        if (programmers.length <= programmersIndex) {
            programmers = extendArrayLength(programmers);
        }
        programmers[programmersIndex] = programmer;
        programmersIndex += 1;
    }

    public void  add(QAEngineer qaEngineer) {
        if (qaEngineers.length <= qaEngineersIndex) {
            qaEngineers = extendArrayLength(qaEngineers);
        }
        qaEngineers[qaEngineersIndex] = qaEngineer;
        qaEngineersIndex += 1;
    }

    public void add(Worker worker) {
        if (worker == null) {
            return;
        } else if (worker instanceof Manager) {
            add((Manager) worker);
        } else if (worker instanceof Programmer) {
            add((Programmer) worker);
        } else if (worker instanceof QAEngineer) {
            add((QAEngineer) worker);
        } else {
            System.out.println("Unknown worker class");
        }
    }

    private Worker[] extendArrayLength(Worker[] initialArray) {
        Worker[] resultArray = new Worker[initialArray.length * LENGTH_EXTEND_FACTOR];
        int firstElementPosition = 0;
        System.arraycopy(initialArray, firstElementPosition, resultArray, firstElementPosition, initialArray.length);
        System.out.println("Initial array was extended from " + initialArray.length + " to " + resultArray.length);
        return resultArray;
    }

}
