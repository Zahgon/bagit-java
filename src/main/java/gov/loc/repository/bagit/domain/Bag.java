package gov.loc.repository.bagit.domain;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * The main representation of the bagit spec.
 */
public final class Bag {

    //The original version of the bag
    private Version version = new Version(-1, -1);

    //from the bagit.txt or UTF-8 for new bags
    private Charset fileEncoding = StandardCharsets.UTF_8;

    //equivalent to the manifest-<ALG>.txt files
    private Set<Manifest> payLoadManifests = new HashSet<>();

    //equivalent to the tagmanifest-<ALG>.txt  files
    private Set<Manifest> tagManifests = new HashSet<>();

    //equivalent to the fetch.txt
    private List<FetchItem> itemsToFetch = new ArrayList<>();

    //equivalent to the bag-info.txt
    private Metadata metadata = new Metadata();

    //the current location of the bag on the filesystem
    private Path rootDir;

    /**
     * empty bag with an invalid version
     */
    public Bag() {
        //intentionally empty
    }

    /**
     * empty bag with the specified bag version
     *
     * @param version the version of the bag
     */
    public Bag(final Version version) {
        this.version = version;
    }

    /**
     * Create a new bag with the same values as the supplied bag
     *
     * @param bag the bag to clone
     */
    public Bag(final Bag bag) {
        this.version = bag.getVersion();
        this.fileEncoding = bag.fileEncoding;
        this.itemsToFetch = bag.getItemsToFetch();
        this.metadata = bag.getMetadata();
        this.payLoadManifests = bag.getPayLoadManifests();
        this.tagManifests = bag.getTagManifests();
        this.rootDir = bag.getRootDir();
    }

    public Version getVersion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<Manifest> getPayLoadManifests() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setPayLoadManifests(final Set<Manifest> payLoadManifests) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Set<Manifest> getTagManifests() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTagManifests(final Set<Manifest> tagManifests) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<FetchItem> getItemsToFetch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setItemsToFetch(final List<FetchItem> itemsToFetch) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Metadata getMetadata() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMetadata(final Metadata metadata) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Charset getFileEncoding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setFileEncoding(final Charset fileEncoding) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

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

    public Path getRootDir() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setRootDir(final Path rootDir) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setVersion(final Version version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
