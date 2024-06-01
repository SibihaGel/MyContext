package quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Setter
public class TerminatorQuoter implements Quoter {


    private String message;



    public TerminatorQuoter () {
        System.out.println("Конструктор... Phase 1");
    }

    @Override
    public void sayQuoter() {
        System.out.println(" message : " + message);
    }



}
