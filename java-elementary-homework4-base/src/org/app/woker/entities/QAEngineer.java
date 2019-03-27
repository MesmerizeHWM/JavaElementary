package org.app.woker.entities;

/*
 * Class for representation info about QA engineer.
 *
 * @author alitvinov
 */
public class QAEngineer extends Worker{

    boolean automationQA;

    @Override
    public String getWorkerPosition() {
        return "QAEngineer";
    }
}
