package com.example.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "events", schema = "public")
public class EventsEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    private String disc;
    private Date start;
    private Date finish;
    @ManyToOne
    @JoinColumn(name = "target", referencedColumnName = "id")
    private EventsTypesEntity eventsTypesByTarget;


    @OneToOne
    @JoinColumn(name = "creator", referencedColumnName = "id")
    private  UsersEntity creator;


    public EventsEntity() {
    }

    public EventsEntity(String disc, Date start, Date finish, EventsTypesEntity eventsTypesByTarget, UsersEntity creator) {
        this.disc = disc;
        this.start = start;
        this.finish = finish;
        this.eventsTypesByTarget = eventsTypesByTarget;
        this.creator = creator;
    }

    public UsersEntity getCreator() {
        return creator;
    }

    public void setCreator(UsersEntity creator) {
        this.creator = creator;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "disc")
    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    @Basic
    @Column(name = "start")
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    @Basic
    @Column(name = "finish")
    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventsEntity that = (EventsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (disc != null ? !disc.equals(that.disc) : that.disc != null) return false;
        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        if (finish != null ? !finish.equals(that.finish) : that.finish != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (disc != null ? disc.hashCode() : 0);
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (finish != null ? finish.hashCode() : 0);
        return result;
    }


    public EventsTypesEntity getEventsTypesByTarget() {
        return eventsTypesByTarget;
    }

    public void setEventsTypesByTarget(EventsTypesEntity eventsTypesByTarget) {
        this.eventsTypesByTarget = eventsTypesByTarget;
    }
}
