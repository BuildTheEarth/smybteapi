package net.buildtheearth.terraplusplus.projection.transform;

import com.fasterxml.jackson.annotation.JsonGetter;

import net.buildtheearth.terraplusplus.projection.GeographicProjection;

/**
 * Warps a Geographic projection and applies a transformation to it.
 */
public abstract class ProjectionTransform implements GeographicProjection {
    protected final GeographicProjection delegate;

    /**
     * @param delegate - projection to transform
     */
    public ProjectionTransform(GeographicProjection delegate) {
        this.delegate = delegate;
    }

    @Override
    public boolean upright() {
        return this.delegate.upright();
    }

    @Override
    public double[] bounds() {
        return this.delegate.bounds();
    }

    @Override
    public double metersPerUnit() {
        return this.delegate.metersPerUnit();
    }

    @JsonGetter
	public GeographicProjection getDelegate() {
		return delegate;
	}
    
    
}
