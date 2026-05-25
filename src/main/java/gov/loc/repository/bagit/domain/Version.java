package gov.loc.repository.bagit.domain;

import java.util.Objects;

/**
 * The version of the bagit specification used to create the bag.
 */
public final class Version implements Comparable<Version> {

    public final int major;

    public final int minor;

    private transient final String cachedToString;

    public Version(final int major, final int minor) {
        this.major = major;
        this.minor = minor;
        this.cachedToString = major + "." + minor;
    }

    public static Version LATEST_BAGIT_VERSION() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compareTo(final Version o) {
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

    public boolean isNewer(final Version version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSameOrNewer(final Version version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isOlder(final Version version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean isSameOrOlder(final Version version) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getMajor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getMinor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
