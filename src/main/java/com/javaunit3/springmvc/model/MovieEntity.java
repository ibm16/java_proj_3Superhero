package com.javaunit3.springmvc.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "superhero")
public class MovieEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "superhero_id")
    private Integer id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "power_score")
    private String power_score;

    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "superhero_id")
    private List<VoteEntity> votes;

    public List<VoteEntity> getVotes()
    {
        return votes;
    }

    public void setVotes(List<VoteEntity> votes)
    {
        this.votes = votes;
    }

    public void addVote(VoteEntity vote)
    {
        this.votes.add(vote);
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return full_name;
    }

    public void setTitle(String full_name)
    {
        this.full_name = full_name;
    }

    public String getMaturityRating()
    {
        return power_score;
    }

    public void setMaturityRating(String power_score)
    {
        this.power_score = power_score;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String title)
    {
        this.description = description;
    }

}
