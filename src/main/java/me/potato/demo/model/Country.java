package me.potato.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Cacheable
public class Country {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Integer dialInCode;

  @OneToMany
  @Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
  private List<City> cities;
}
