package CollectionsTT.random.queueH;

import static CollectionsTT.random.queueH.Priority.*;

public enum RequestType {
    OTHER(LOW),CHANGE_ACCOUNT_DETAILS(LOW),CAN_NOT_LOGIN(LOW),_ACCOUNT_IS_BLOCKED(MEDIUM),
    COOPERATION(MEDIUM),ACCOUNT_IS_HACKED(HIGH),CAN_NOT_COMPLETE_PURCHASE(HIGH),ORDER_IS_NOT_RECEIVED(HIGH);

    private Priority priority;

    private  RequestType(Priority priority){
        this.priority = priority;
    }

    public Priority getPriority() {
        return this.priority;
    }
}
