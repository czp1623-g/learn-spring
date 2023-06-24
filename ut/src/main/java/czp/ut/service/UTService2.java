package czp.ut.service;

import org.springframework.stereotype.Service;

@Service
public class UTService2 {
    public Object pbl() {
        System.out.println("in public method...");
        return "++public";
    }
}
