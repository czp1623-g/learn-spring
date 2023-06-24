import czp.ut.UTStarter;
import czp.ut.service.UTService;
import czp.ut.service.UTService2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.powermock.api.mockito.PowerMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest(classes = {UTStarter.class})
@ExtendWith(value = {SpringExtension.class})
@AutoConfigureMockMvc
public class Uttttt {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UTService2 utService2;

    @Test
    public void m1() throws Exception {

//        when(service2.pbl()).thenReturn("拦截了哦");
        UTService spy = PowerMockito.mock(UTService.class);
        PowerMockito.when(spy, "prv", anyString()).thenReturn("makkkkkakkkk");

        mockMvc.perform(MockMvcRequestBuilders
                    .get("/ut/1")
                    .accept(MediaType.APPLICATION_JSON)
                    .contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(print());
    }

}
