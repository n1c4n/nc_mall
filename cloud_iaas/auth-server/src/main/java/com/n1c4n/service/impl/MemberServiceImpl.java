package com.n1c4n.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.n1c4n.mapper.MemberMapper;
import com.n1c4n.domain.Member;
import com.n1c4n.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * 用户表(Member)表服务实现类
 *
 * @author makejava
 * @since 2023-11-28 16:25:28
 */
@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}

