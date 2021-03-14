package CollectionsTT.random.queueH;

import java.util.Comparator;

public class CustomerSupportComparator implements Comparator<SupportTicket> {

    @Override
    public int compare(SupportTicket tk1, SupportTicket tk2) {
       if (tk1 ==null||tk2 ==null||tk1.getPriority() ==null|| tk2.getPriority()==null){
           return 0;
       }
       int result = tk1.getPriority().compareTo(tk2.getPriority());
       if (result ==0){
           result =tk2.getSequentialNumber() - tk1.getSequentialNumber();
       }
       return result;
    }
}
