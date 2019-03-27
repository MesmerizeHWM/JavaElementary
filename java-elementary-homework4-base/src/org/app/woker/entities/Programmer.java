package org.app.woker.entities;

/**
 * Class for representation info about programmer.
 *
 * @author alitvinov
 */
public class Programmer extends Worker{

    private String language;
    private String rate;

    @Override
    public String getWorkerPosition() {
        return "Programmer";
    }
}
