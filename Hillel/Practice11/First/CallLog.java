package Game.First;

import java.util.*;

public class CallLog {
    private Date date;
    private String mobNumber;

    public CallLog(Date date, String mobNumber) {
        this.date = date;
        this.mobNumber = mobNumber;
    }

    Collection<CallLog> find(Collection<CallLog> array, String mobNumberSearch) {
        List<CallLog> contactListResult = new ArrayList<>();
        for (CallLog callLog : array) {
            if (callLog.getMobNumber().equals(mobNumberSearch)) {
                contactListResult.add(callLog);
            }
        }
        return contactListResult;
    }

    public Date getDate() {
        return date;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallLog callLog = (CallLog) o;
        return Objects.equals(date, callLog.date) &&
                Objects.equals(mobNumber, callLog.mobNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, mobNumber);
    }
}
