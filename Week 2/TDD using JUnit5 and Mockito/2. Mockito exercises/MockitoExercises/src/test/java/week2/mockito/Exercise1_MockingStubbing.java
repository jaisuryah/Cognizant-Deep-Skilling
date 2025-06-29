package week2.mockito;

import static org.mockito.Mockito.*;
import java.util.List;

public class Exercise1_MockingStubbing {

    @Test
    void testMockList() {
        List<String> mockList = mock(List.class);

        when(mockList.get(0)).thenReturn("Hello");
        when(mockList.size()).thenReturn(3);

        System.out.println(mockList.get(0));  
        System.out.println(mockList.size()); 
    }
}
