package org.openmrs.module.restAddon.api;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Provider;
import org.openmrs.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by werick on 13/10/15.
 */
@Entity
@Table(name = "provider_list")

public class ProviderList extends BaseOpenmrsData {

    @Id
    @GeneratedValue
    @Column(name = "provider_list_id")
    private Integer providerlistId;
    private Provider provider;

    @Column(name = "list_description")
    private String listDescription;

    @ManyToOne
    @JoinColumn(name = "user")
    private User creator;

    @ManyToOne
    @JoinColumn(name = "user")
    private User changedBy;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "date_changed")
    private Date dateChanged;



    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProviderlistId() {
        return providerlistId;
    }

    public void setProviderlistId(Integer providerlistId) {
        this.providerlistId = providerlistId;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getListDescription() {
        return listDescription;
    }

    public void setListDescription(String listDescription) {
        this.listDescription = listDescription;
    }

    @Override
    public User getCreator() {
        return creator;
    }

    @Override
    public void setCreator(User creator) {
        this.creator = creator;
    }

    @Override
    public User getChangedBy() {
        return changedBy;
    }

    @Override
    public void setChangedBy(User changedBy) {
        this.changedBy = changedBy;
    }

    @Override
    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public Date getDateChanged() {
        return dateChanged;
    }

    @Override
    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }
}
