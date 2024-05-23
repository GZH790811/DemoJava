import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author 高哲浩
 * @Date 2024/5/22 10:52
 * @PackageName:PACKAGE_NAME
 * @ClassName: Test
 * @Description
 */

@SpringBootTest(classes = Test.class)
public class Test {



    @Autowired
    private RedisTemplate redisTemplate;


    @org.junit.jupiter.api.Test
     void getName(){
        redisTemplate.opsForValue().set("name","gzh");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }

}
