public class PK implements Serializable {
    private String itemId;
    private String userId;
}

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
