package org.app.woker.entities;

/*
 * Class for representation info about manager.
 *
 * @author alitvinov
 */
public class Manager extends Worker{

    private String project;
    private int experience;

    @Override
    public String getWorkerPosition() {
        return "Manager";
    }
}
