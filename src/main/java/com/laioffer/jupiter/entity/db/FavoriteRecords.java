package com.laioffer.jupiter.entity.db;

import com.laioffer.jupiter.entity.db.PK;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "favorite_records")
@IdClass(PK.class)
public class FavoriteRecords {
    @Id
    private String itemId;
    @Id
    private String userId;

    private Date timestamp;
}
