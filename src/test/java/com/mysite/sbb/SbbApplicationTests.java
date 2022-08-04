package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Transactional
    @Test
    void testJpa() {
        // 질문 저장 (Q Create)
        /*// 첫 번째 질문 저장
        Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        q1.setContent("sbb에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        // 두 번째 질문 저장
        Question q2 = new Question();
        q2.setSubject("스프링부트 모델 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);*/

        // assertEquals로 데이터 검사 (Q Read)
        /*List<Question> all = this.questionRepository.findAll();
        assertEquals(2, all.size());

        Question q = all.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());*/

        // findById(Q Read)
        /* Optional<Question> oq = this.questionRepository.findById(1);
        if(oq.isPresent()){
            Question q = oq.get();
            assertEquals("sbb가 무엇인가요?", q.getSubject());
        }*/

        // findBySubject(Q Read)
        /*Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
        assertEquals(5, q.getId());*/

        // findBySubjectAndContent(Q Read)
        /*Question q = this.questionRepository.findBySubjectAndContent(
                "sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다."
        );
        assertEquals(5, q.getId());*/

        // findBySubjectLike(Q Read)
        /*List<Question> qList = this.questionRepository.
                findBySubjectLike("sbb%");
        Question q = qList.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());*/

        // 질문 수정(Q Update)
        /*Optional<Question> oq = this.questionRepository.findById(5);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        q.setSubject("수정된 제목");
        this.questionRepository.save(q);*/

        // 질문 삭제(Q Delete)
        /*assertEquals(2, this.questionRepository.count());
        Optional<Question> oq = this.questionRepository.findById(5);
        assertTrue(oq.isPresent());
        this.questionRepository.delete(oq.get());
        assertEquals(1, this.questionRepository.count());*/

        // 답변 생성, 저장(A Create)
        /*Optional<Question> oq = this.questionRepository.findById(6);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion(q);
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);*/

        // 답변 조회(A READ)
        /*Optional<Answer> oa = this.answerRepository.findById(1);
        assertTrue(oa.isPresent());
        Answer a = oa.get();
        assertEquals(6, a.getQuestion().getId());*/

        // 답변에 연결된 질문 찾기, 질문에 달린 답변 찾기
        // 질문 찾기 - a.getQuestion()
        // 답변 찾기
        /*Optional<Question> oq = this.questionRepository.findById(6);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();
        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.",
                answerList.get(0).getContent());*/
    }
}
