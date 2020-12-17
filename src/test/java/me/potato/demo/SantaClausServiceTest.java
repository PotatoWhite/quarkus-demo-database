package me.potato.demo;

import io.quarkus.test.junit.QuarkusTest;
import lombok.extern.slf4j.Slf4j;
import me.potato.demo.model.Gift;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@Slf4j
@QuarkusTest
class SantaClausServiceTest {

  @Inject
  SantaClausService service;

  @Test
  void createAGift(){
    service.createGift("sample1");
    service.createGift("sample2");
    service.createGift("sample3");
    service.createGift("sample4");
    service.createGift("sample5");
    service.createGift("sample6");
    service.createGift("sample7");
    service.createGift("sample8");


    log.info("==================");
    service.getById(1l);
    service.getById(2l);
    service.getById(3l);
    service.getById(4l);
    service.getById(5l);
    service.getById(6l);


    log.info("==================");

    service.getById(1l);
    service.getById(2l);
    service.getById(3l);
    service.getById(4l);
    service.getById(5l);
    service.getById(6l);

    log.info("==================");


    service.getById(1l);
    service.getById(2l);
    service.getById(3l);
    service.getById(4l);
    service.getById(5l);
    service.getById(6l);

  }
}