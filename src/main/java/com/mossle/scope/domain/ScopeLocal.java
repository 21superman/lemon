package com.mossle.scope.domain;

// Generated by Hibernate Tools
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ScopeLocal .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "SCOPE_LOCAL")
public class ScopeLocal implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private ScopeGlobal scopeGlobal;

    /** null. */
    private String name;

    /** null. */
    private Integer shared;

    /** null. */
    private String reference;

    public ScopeLocal() {
    }

    public ScopeLocal(ScopeGlobal scopeGlobal, String name, Integer shared,
            String reference) {
        this.scopeGlobal = scopeGlobal;
        this.name = name;
        this.shared = shared;
        this.reference = reference;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GLOBAL_ID")
    public ScopeGlobal getScopeGlobal() {
        return this.scopeGlobal;
    }

    /**
     * @param scopeGlobal
     *            null.
     */
    public void setScopeGlobal(ScopeGlobal scopeGlobal) {
        this.scopeGlobal = scopeGlobal;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "SHARED")
    public Integer getShared() {
        return this.shared;
    }

    /**
     * @param shared
     *            null.
     */
    public void setShared(Integer shared) {
        this.shared = shared;
    }

    /** @return null. */
    @Column(name = "REFERENCE", length = 50)
    public String getReference() {
        return this.reference;
    }

    /**
     * @param reference
     *            null.
     */
    public void setReference(String reference) {
        this.reference = reference;
    }
}