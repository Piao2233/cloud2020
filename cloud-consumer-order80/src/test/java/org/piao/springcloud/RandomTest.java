package org.piao.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.piao.springcloud.entities.Payment;
import org.piao.springcloud.entities.UserPo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author：piao
 * @Date：2022/12/12 9:18 PM
 */
@SpringBootTest
@Slf4j
public class RandomTest {

    @Test
    public void StreamTestor() {

        List<UserPo> userPos = new ArrayList<>();
        UserPo userPo1 = new UserPo();
        userPo1.setName("caojiche");
        userPo1.setScore(new Double("99.5"));
        UserPo userPo2 = new UserPo();
        userPo2.setName("ddf");
        userPo2.setScore(new Double("98.5"));
        UserPo userPo3 = new UserPo();
        userPo3.setName("piao");
        userPo3.setScore(new Double("90.5"));
        userPos.add(userPo1);
        userPos.add(userPo2);
        userPos.add(userPo3);

        // stream中filter的用法
        long count = userPos.stream().filter(p -> !ObjectUtils.isEmpty(p.getScore())).count();
        log.info("有成绩的学生数量为：" + count);

        // stream中map的用法
        List<Double> scoreCollections = userPos.stream().map(p -> p.getScore()).collect(Collectors.toList());
        log.info("学生分数的集合为：" + scoreCollections);

        String collect = userPos.stream().map(p -> p.getName()).collect(Collectors.joining(","));
        log.info("学生姓名的集合为：" + collect);

        // stream中sort的用法
        List<UserPo> collect1 = userPos.stream().filter(p -> ObjectUtils.isEmpty(p.getScore())).
                sorted(Comparator.comparing(UserPo::getScore).reversed()).collect(Collectors.toList());
        log.info("成绩经过排序后的学生的集合" + collect1);

        // 每个学生的成绩减10分
        userPos.stream().forEach(p -> p.setScore(p.getScore() -10));
        userPos.stream().forEach(p -> System.out.println(p.getScore()));

        List<UserPo> collect2 = userPos.stream().filter(cjc -> cjc.getScore() < 85).collect(Collectors.toList());
        log.info("    " + collect2);


    }

    @Test
    public void intTestor() {
        System.out.println(Integer.MAX_VALUE);
    }
}
