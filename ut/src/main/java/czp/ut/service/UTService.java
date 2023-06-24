package czp.ut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ut-service")
public class UTService {
    @Autowired
    UTService2 utService2;
    public Object m1() {
        System.out.println("running m1 service");
        return "from m1 " + prv("");
    }

    private Object prv(String a) {
        System.out.println("in the private method.." + a);
        return "++private" + utService2.pbl();
    }


}
