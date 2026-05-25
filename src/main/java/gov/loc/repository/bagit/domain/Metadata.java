package gov.loc.repository.bagit.domain;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A class to represent the bag-info.txt (and package-info.txt in older versions)
 */
@SuppressWarnings({ "PMD.UseLocaleWithCaseConversions" })
public class Metadata {

    private static final String PAYLOAD_OXUM = "Payload-Oxum";

    private Map<String, List<String>> map = new HashMap<>();

    private List<SimpleImmutableEntry<String, String>> list = new ArrayList<>();

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * all the metadata
     *
     * @return return the order and case preserved metadata
     */
    public List<SimpleImmutableEntry<String, String>> getAll() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * get all the values for a specific label (key)
     *
     * @param key the case insensitive label(key) in the metadata
     *
     * @return the list of values for that label
     */
    public List<String> get(final String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * add a entry into the metadata or append a value if the label already exists
     *
     * @param key the label
     * @param value the value of the label
     *
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     */
    public boolean add(final String key, final String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * remove the label and all its values
     *
     * @param key the label to remove along with its value(s)
     */
    public void remove(final String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * check if the metadata contains a particular label(key)
     *
     * @param key the label to check
     * @return if the label exists
     */
    public boolean contains(final String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * add multiple metadata entries
     *
     * @param data the metadata to add
     */
    public void addAll(final List<SimpleImmutableEntry<String, String>> data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * payload oxum is a special case where it makes no sense to have multiple values so instead of just appending we upsert (insert or update)
     * @param payloadOxumValue the value payload-oxum should be set to
     *
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     */
    public boolean upsertPayloadOxum(final String payloadOxumValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return true if this metadata contains no entries
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected Map<String, List<String>> getMap() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void setMap(final Map<String, List<String>> map) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected List<SimpleImmutableEntry<String, String>> getList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void setList(final List<SimpleImmutableEntry<String, String>> list) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
