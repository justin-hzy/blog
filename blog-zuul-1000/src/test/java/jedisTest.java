import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;


import java.util.HashMap;
import java.util.Map;


public class jedisTest {
    /*@Test
    public void  main() throws JsonProcessingException {
        Jedis jedis = new Jedis("95.169.19.152",6379);
        System.out.println(jedis.ping());
        jedis.flushDB();
        jedis.select(0);
        Map map = new HashMap<>();
        map.put("username","hzy");
        map.put("hello","world");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(map);

        jedis.set("username1","hzy1");
        System.out.println(jedis.get("username1"));

        Transaction multi =  jedis.multi();
        //multi.watch(json);
        try{
            multi.set("user1",json);
            multi.set("user2",json);
            int i = 1/0;
            multi.exec();
        }catch (Exception e ){
            multi.discard();
            e.printStackTrace();
        }finally {
            System.out.println(jedis.get("user1"));
            System.out.println(jedis.get("user2"));
            jedis.close();
        }

    }*/
}
