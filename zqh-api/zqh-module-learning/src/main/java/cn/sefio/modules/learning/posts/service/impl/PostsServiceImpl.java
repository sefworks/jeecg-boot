package cn.sefio.modules.learning.posts.service.impl;

import cn.sefio.modules.learning.posts.entity.Posts;
import cn.sefio.modules.learning.posts.mapper.PostsMapper;
import cn.sefio.modules.learning.posts.service.IPostsService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 文章
 * @Author: jeecg-boot
 * @Date:   2021-03-07
 * @Version: V1.0
 */
@Service
public class PostsServiceImpl extends ServiceImpl<PostsMapper, Posts> implements IPostsService {

}
