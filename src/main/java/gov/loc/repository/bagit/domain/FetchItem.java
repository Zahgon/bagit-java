package gov.loc.repository.bagit.domain;

import java.net.URL;
import java.nio.file.Path;
import java.util.Objects;

/**
 * An individual item to fetch as specified by
 * <a href="https://tools.ietf.org/html/draft-kunze-bagit-13#section-2.2.3">https://tools.ietf.org/html/draft-kunze-bagit-13#section-2.2.3</a>
 */
public final class FetchItem {

    /**
     * The url from which the item can be downloaded
     */
    public final URL url;

    /**
     * The length of the file in octets
     */
    public final Long length;

    /**
     * The path where the fetched item should be put
     */
    public final Path path;

    private transient String cachedString;

    /**
     * @param url the {@link URL} of the file
     * @param length the file length in bytes, -1 or null to not specify the length
     * @param path the path in the bag where the file belongs
     */
    public FetchItem(final URL url, final Long length, final Path path) {
        this.url = url;
        this.length = length;
        this.path = path;
    }

    private String internalToString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(url).append(' ');
        if (length == null || length < 0) {
            sb.append("- ");
        } else {
            sb.append(length).append(' ');
        }
        sb.append(path);
        return sb.toString();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public URL getUrl() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Path getPath() {
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
}
