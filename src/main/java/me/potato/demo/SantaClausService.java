package me.potato.demo;

import me.potato.demo.model.Gift;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class SantaClausService {
  @Inject
  EntityManager em;

  @Transactional
  public void createGift(String giftDescription) {
    Gift gift = new Gift();
    gift.setName(giftDescription);
    em.persist(gift);
  }

  public Gift getById(Long id) {
    return em.createQuery("SELECT g FROM Gift g WHERE g.id=:id", Gift.class)
             .setParameter("id", id)
             .setHint("org.hibernate.cacheable", Boolean.TRUE)
             .getSingleResult();

  }
}
