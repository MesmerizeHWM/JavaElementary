package org.app.woker.entities;

/**
 * Basic class for representation of Worker information.
 *
 * @author alitvinov
 */
public class Worker {

    protected String workerId;

    protected String workerName;

    protected String workerPosition = "Simple worker";

    public String getWorkerPosition() {
        return workerPosition;
    }
}
