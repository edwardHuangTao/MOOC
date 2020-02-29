//package com.hongxuan;
//
//import com.hongxuan.mapper.TbCourseMapper;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = MoocApplication.class)
//public class UserMapperTest {
//
//    @Autowired
//    TbCourseMapper userMapper;
//
//    @Test
//    public void testselectByPrimaryKey(){
////        TbCourseMapper userMapper = context.getBean(TbCourseMapper.class);
////        TbCourse user = userMapper.selectByPrimaryKey(1);
//        int i = userMapper.selectCount(null);
//        System.out.println(i);
//    }
////    @Test
////    public void testinsertSelective(){
////        UserMapper userMapper = context.getBean(UserMapper.class);
////        User user = new User();
////        user.setUsername("马超");
////        user.setAddress("深圳黑马");
////        user.setSex("1");
////        userMapper.insertSelective(user);
////        System.out.println(user);
////    }
////    @Test
////    public void testselectByExample(){
////        UserMapper userMapper = context.getBean(UserMapper.class);
////
////        //构造查询条件
////        Example example = new Example(User.class);
////        Example.Criteria criteria = example.createCriteria();
////        criteria.andLike("username", "%张%");
////
////        //查询数据并输出
////        List<User> users = userMapper.selectByExample(example);
////        for (User user : users) {
////            System.out.println(user);
////        }
////    }
//
//}
