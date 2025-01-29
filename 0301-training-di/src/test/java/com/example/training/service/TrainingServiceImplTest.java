package com.example.training.service;

import java.util.List;

import com.example.training.repository.TrainingRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.training.entity.Training;
import org.mockito.Mockito;

class TrainingServiceImplTest {
    @Test
    public void test_findAll() {
        TrainingRepository trainingRepository = new MockTrainingRepository();
        TrainingService trainingService = new TrainingServiceImpl(trainingRepository);
        // test도 하나의 "외부" 코드이고
        // repository를 만들어서, serviece 객체에 DI
        @SuppressWarnings("null")
		List<Training> trainings = trainingService.findAll();
        // 결과 확인
        Assertions.assertThat(trainings.size()).isEqualTo(10);
    }
}