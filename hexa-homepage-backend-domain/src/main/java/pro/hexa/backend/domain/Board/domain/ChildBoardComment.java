package pro.hexa.backend.domain.Board.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;

@Entity(name = "ChildBoardComment")
@Getter
public class ChildBoardComment extends BoardComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "childBoardComment_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="parentBoardComment_id")
    private Board parentComment;
}
