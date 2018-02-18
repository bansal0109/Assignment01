package smartcontrols.in.assignment_task.network.exception;

/**
 * Created by Prateek on 2/15/2018.
 */

public class ModuleException extends RuntimeException {

    // Constructor call for initilization of Exception message to the client.
    public ModuleException(String errorMessgae) {
        super(errorMessgae);
    }
}
