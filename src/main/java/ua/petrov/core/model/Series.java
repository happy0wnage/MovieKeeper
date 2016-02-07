package ua.petrov.core.model;

import javax.persistence.*;

@Entity
@Table(name = "series", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id_series")
})
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_series", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_movie")
    private Movie movie;

    @Column(name = "season", nullable = false)
    private Integer season;

    @Column(name = "episode", nullable = false)
    private Integer episode;

    @Column(name = "name")
    private String name;

    @Column(name = "viewed", nullable = false)
    private boolean viewed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getEpisode() {
        return episode;
    }

    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getViewed() {
        return viewed;
    }

    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
    }

    @Override
    public String toString() {
        return "Series{" +
                "id=" + id +
                ", movie=" + movie +
                ", season=" + season +
                ", episode=" + episode +
                ", name='" + name + '\'' +
                ", viewed=" + viewed +
                '}';
    }
}
