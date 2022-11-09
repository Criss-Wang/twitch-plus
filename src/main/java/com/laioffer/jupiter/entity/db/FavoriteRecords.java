package com.laioffer.jupiter.entity.db;

import com.laioffer.jupiter.entity.db.PK;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "favorite_records")
@IdClass(PK.class)
public class FavoriteRecords {
    @Id
    @Column(name = "item_id")
    private String itemId;

    @Id
    @Column(name = "user_id")
    private String userId;

    private Date timestamp;
}
