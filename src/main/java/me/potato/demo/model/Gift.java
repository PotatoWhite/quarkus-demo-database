package me.potato.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Gift {
  @Id
  @SequenceGenerator(name = "giftSeq", sequenceName = "gift_id_seq", allocationSize = 1, initialValue = 1)
  @GeneratedValue(generator = "giftSeq")
  private Long   id;
  private String name;

}
