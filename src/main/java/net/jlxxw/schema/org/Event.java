package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Event extends AbstractSchema {
    public Event() {
    }

    /**
     * The eventAttendanceMode of an event indicates whether it occurs online, offline, or a mix.
     */
    @JsonProperty("eventAttendanceMode")
    private EventAttendanceModeEnumeration eventAttendanceMode;
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @JsonProperty("aggregateRating")
    private AbstractSchema aggregateRating;
    /**
     * The maximum physical attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OfflineEventAttendanceMode]] (or the offline aspects, in the case of a [[MixedEventAttendanceMode]]).
     */
    @JsonProperty("maximumPhysicalAttendeeCapacity")
    private Integer maximumPhysicalAttendeeCapacity;
    /**
     * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled.
     */
    @JsonProperty("eventStatus")
    private EventStatusType eventStatus;
    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. E.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @JsonProperty("sponsor")
    private List<AbstractSchema> sponsor;
    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     */
    @JsonProperty("funding")
    private Grant funding;
    /**
     * A work performed in some event, for example a play performed in a TheaterEvent.
     */
    @JsonProperty("workPerformed")
    private CreativeWork workPerformed;
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @JsonProperty("offers")
    private List<AbstractSchema> offers;
    /**
     * A person attending the event.
     */
    @JsonProperty("attendees")
    private List<AbstractSchema> attendees;
    /**
     * A person or organization attending the event.
     */
    @JsonProperty("attendee")
    private List<AbstractSchema> attendee;
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     */
    @JsonProperty("location")
    private String location;
    /**
     * An organizer of an Event.
     */
    @JsonProperty("organizer")
    private List<AbstractSchema> organizer;
    /**
     * The total number of individuals that may attend an event or venue.
     */
    @JsonProperty("maximumAttendeeCapacity")
    private Integer maximumAttendeeCapacity;
    /**
     * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated.
     */
    @JsonProperty("previousStartDate")
    private java.time.LocalDate previousStartDate;
    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @JsonProperty("contributor")
    private List<AbstractSchema> contributor;
    /**
     * A director of e.g. TV, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     */
    @JsonProperty("director")
    private Person director;
    /**
     * The maximum virtual attendee capacity of an [[Event]] whose [[eventAttendanceMode]] is [[OnlineEventAttendanceMode]] (or the online aspects, in the case of a [[MixedEventAttendanceMode]]).
     */
    @JsonProperty("maximumVirtualAttendeeCapacity")
    private Integer maximumVirtualAttendeeCapacity;
    /**
     * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor.
     */
    @JsonProperty("performer")
    private List<AbstractSchema> performer;
    /**
     * The CreativeWork that captured all or part of this Event.
     */
    @JsonProperty("recordedIn")
    private CreativeWork recordedIn;
    /**
     * An actor (individual or a group), e.g. in TV, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     */
    @JsonProperty("actor")
    private List<AbstractSchema> actor;
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @JsonProperty("inLanguage")
    private String inLanguage;
    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    @JsonProperty("typicalAgeRange")
    private String typicalAgeRange;
    /**
     * The time admission will commence.
     */
    @JsonProperty("doorTime")
    private java.time.LocalDateTime doorTime;
    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @JsonProperty("translator")
    private List<AbstractSchema> translator;
    /**
     * The main performer or performers of the event&#x2014;for example, a presenter, musician, or actor.
     */
    @JsonProperty("performers")
    private List<AbstractSchema> performers;
    /**
     * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference.
     */
    @JsonProperty("subEvent")
    private Event subEvent;
    /**
     * Events that are a part of this event. For example, a conference event includes many presentations, each subEvents of the conference.
     */
    @JsonProperty("subEvents")
    private Event subEvents;
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @JsonProperty("startDate")
    private java.time.LocalDate startDate;
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @JsonProperty("funder")
    private List<AbstractSchema> funder;
    /**
     * A work featured in some event, e.g. exhibited in an ExhibitionEvent.
     * Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent).
     */
    @JsonProperty("workFeatured")
    private CreativeWork workFeatured;
    /**
     * A flag to signal that the item, event, or place is accessible for free.
     */
    @JsonProperty("isAccessibleForFree")
    private Boolean isAccessibleForFree;
    /**
     * Associates an [[Event]] with a [[Schedule]]. There are circumstances where it is preferable to share a schedule for a series of
     * repeating events rather than data on the individual events themselves. For example, a website or application might prefer to publish a schedule for a weekly
     * gym class rather than provide data on every event. A schedule could be processed by applications to add forthcoming events to a calendar. An [[Event]] that
     * is associated with a [[Schedule]] using this property should not have [[startDate]] or [[endDate]] properties. These are instead defined within the associated
     * [[Schedule]], this avoids any ambiguity for clients using the data. The property might have repeated values to specify different schedules, e.g. for different months
     * or seasons.
     */
    @JsonProperty("eventSchedule")
    private Schedule eventSchedule;
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @JsonProperty("composer")
    private List<AbstractSchema> composer;
    /**
     * The subject matter of the content.
     */
    @JsonProperty("about")
    private Thing about;
    /**
     * A review of the item.
     */
    @JsonProperty("review")
    private AbstractSchema review;
    /**
     * An event that this event is a part of. For example, a collection of individual music performances might each have a music festival as their superEvent.
     */
    @JsonProperty("superEvent")
    private Event superEvent;
    /**
     * Keywords or tags used to describe some item. Multiple textual entries in a keywords list are typically delimited by commas, or by repeating the property.
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @JsonProperty("endDate")
    private java.time.LocalDate endDate;
    /**
     * The number of attendee places for an event that remain unallocated.
     */
    @JsonProperty("remainingAttendeeCapacity")
    private Integer remainingAttendeeCapacity;

    public EventAttendanceModeEnumeration getEventAttendanceMode() {
        return eventAttendanceMode;
    }

    public void setEventAttendanceMode(EventAttendanceModeEnumeration eventAttendanceMode) {
        this.eventAttendanceMode = eventAttendanceMode;
    }

    public AbstractSchema getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AbstractSchema aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public Integer getMaximumPhysicalAttendeeCapacity() {
        return maximumPhysicalAttendeeCapacity;
    }

    public void setMaximumPhysicalAttendeeCapacity(Integer maximumPhysicalAttendeeCapacity) {
        this.maximumPhysicalAttendeeCapacity = maximumPhysicalAttendeeCapacity;
    }

    public EventStatusType getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatusType eventStatus) {
        this.eventStatus = eventStatus;
    }

    public List<AbstractSchema> getSponsor() {
        return sponsor;
    }

    public void setSponsor(List<AbstractSchema> sponsor) {
        this.sponsor = sponsor;
    }

    public Grant getFunding() {
        return funding;
    }

    public void setFunding(Grant funding) {
        this.funding = funding;
    }

    public CreativeWork getWorkPerformed() {
        return workPerformed;
    }

    public void setWorkPerformed(CreativeWork workPerformed) {
        this.workPerformed = workPerformed;
    }

    public List<AbstractSchema> getOffers() {
        return offers;
    }

    public void setOffers(List<AbstractSchema> offers) {
        this.offers = offers;
    }

    public List<AbstractSchema> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<AbstractSchema> attendees) {
        this.attendees = attendees;
    }

    public List<AbstractSchema> getAttendee() {
        return attendee;
    }

    public void setAttendee(List<AbstractSchema> attendee) {
        this.attendee = attendee;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<AbstractSchema> getOrganizer() {
        return organizer;
    }

    public void setOrganizer(List<AbstractSchema> organizer) {
        this.organizer = organizer;
    }

    public Integer getMaximumAttendeeCapacity() {
        return maximumAttendeeCapacity;
    }

    public void setMaximumAttendeeCapacity(Integer maximumAttendeeCapacity) {
        this.maximumAttendeeCapacity = maximumAttendeeCapacity;
    }

    public java.time.LocalDate getPreviousStartDate() {
        return previousStartDate;
    }

    public void setPreviousStartDate(java.time.LocalDate previousStartDate) {
        this.previousStartDate = previousStartDate;
    }

    public List<AbstractSchema> getContributor() {
        return contributor;
    }

    public void setContributor(List<AbstractSchema> contributor) {
        this.contributor = contributor;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public Integer getMaximumVirtualAttendeeCapacity() {
        return maximumVirtualAttendeeCapacity;
    }

    public void setMaximumVirtualAttendeeCapacity(Integer maximumVirtualAttendeeCapacity) {
        this.maximumVirtualAttendeeCapacity = maximumVirtualAttendeeCapacity;
    }

    public List<AbstractSchema> getPerformer() {
        return performer;
    }

    public void setPerformer(List<AbstractSchema> performer) {
        this.performer = performer;
    }

    public CreativeWork getRecordedIn() {
        return recordedIn;
    }

    public void setRecordedIn(CreativeWork recordedIn) {
        this.recordedIn = recordedIn;
    }

    public List<AbstractSchema> getActor() {
        return actor;
    }

    public void setActor(List<AbstractSchema> actor) {
        this.actor = actor;
    }

    public String getInLanguage() {
        return inLanguage;
    }

    public void setInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
    }

    public String getTypicalAgeRange() {
        return typicalAgeRange;
    }

    public void setTypicalAgeRange(String typicalAgeRange) {
        this.typicalAgeRange = typicalAgeRange;
    }

    public java.time.LocalDateTime getDoorTime() {
        return doorTime;
    }

    public void setDoorTime(java.time.LocalDateTime doorTime) {
        this.doorTime = doorTime;
    }

    public List<AbstractSchema> getTranslator() {
        return translator;
    }

    public void setTranslator(List<AbstractSchema> translator) {
        this.translator = translator;
    }

    public List<AbstractSchema> getPerformers() {
        return performers;
    }

    public void setPerformers(List<AbstractSchema> performers) {
        this.performers = performers;
    }

    public Event getSubEvent() {
        return subEvent;
    }

    public void setSubEvent(Event subEvent) {
        this.subEvent = subEvent;
    }

    public Event getSubEvents() {
        return subEvents;
    }

    public void setSubEvents(Event subEvents) {
        this.subEvents = subEvents;
    }

    public java.time.LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(java.time.LocalDate startDate) {
        this.startDate = startDate;
    }

    public List<AbstractSchema> getFunder() {
        return funder;
    }

    public void setFunder(List<AbstractSchema> funder) {
        this.funder = funder;
    }

    public CreativeWork getWorkFeatured() {
        return workFeatured;
    }

    public void setWorkFeatured(CreativeWork workFeatured) {
        this.workFeatured = workFeatured;
    }

    public Boolean getIsAccessibleForFree() {
        return isAccessibleForFree;
    }

    public void setIsAccessibleForFree(Boolean isAccessibleForFree) {
        this.isAccessibleForFree = isAccessibleForFree;
    }

    public Schedule getEventSchedule() {
        return eventSchedule;
    }

    public void setEventSchedule(Schedule eventSchedule) {
        this.eventSchedule = eventSchedule;
    }

    public List<AbstractSchema> getComposer() {
        return composer;
    }

    public void setComposer(List<AbstractSchema> composer) {
        this.composer = composer;
    }

    public Thing getAbout() {
        return about;
    }

    public void setAbout(Thing about) {
        this.about = about;
    }

    public AbstractSchema getReview() {
        return review;
    }

    public void setReview(AbstractSchema review) {
        this.review = review;
    }

    public Event getSuperEvent() {
        return superEvent;
    }

    public void setSuperEvent(Event superEvent) {
        this.superEvent = superEvent;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public java.time.LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(java.time.LocalDate endDate) {
        this.endDate = endDate;
    }

    public Integer getRemainingAttendeeCapacity() {
        return remainingAttendeeCapacity;
    }

    public void setRemainingAttendeeCapacity(Integer remainingAttendeeCapacity) {
        this.remainingAttendeeCapacity = remainingAttendeeCapacity;
    }
}