package week2.mockito.ex2;

import static org.mockito.Mockito.*;
import java.util.List;

public class Exercise2_VerifyInteractions {

    @Test
    void testVerifyMethodCalls() {
        List<String> mockList = mock(List.class);

        mockList.add("Mockito");
        mockList.clear();

        verify(mockList).add("Mockito");
        verify(mockList).clear();
    }
}
