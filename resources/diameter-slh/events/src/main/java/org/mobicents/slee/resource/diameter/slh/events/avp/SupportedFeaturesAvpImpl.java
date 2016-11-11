/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, TeleStax Inc. and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 *   JBoss, Home of Professional Open Source
 *   Copyright 2007-2011, Red Hat, Inc. and individual contributors
 *   by the @authors tag. See the copyright.txt in the distribution for a
 *   full listing of individual contributors.
 *
 *   This is free software; you can redistribute it and/or modify it
 *   under the terms of the GNU Lesser General Public License as
 *   published by the Free Software Foundation; either version 2.1 of
 *   the License, or (at your option) any later version.
 *
 *   This software is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *   Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this software; if not, write to the Free
 *   Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 *   02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.slee.resource.diameter.slh.events.avp;

import net.java.slee.resource.diameter.slh.events.avp.LCSRoutingInfoAVPCodes;
import net.java.slee.resource.diameter.slh.events.avp.SupportedFeaturesAvp;

import org.jdiameter.api.Avp;
import org.mobicents.slee.resource.diameter.base.events.avp.GroupedAvpImpl;

/**
 *
 * Implementation of AVP: {@link SupportedFeaturesAvp} interface.
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 */
public class SupportedFeaturesAvpImpl extends GroupedAvpImpl implements SupportedFeaturesAvp {

  public SupportedFeaturesAvpImpl() {
    super();
  }

  /**
   *
   * @param code
   * @param vendorId
   * @param mnd
   * @param prt
   * @param value
   */
  public SupportedFeaturesAvpImpl(int code, long vendorId, int mnd, int prt, byte[] value) {
    super(code, vendorId, mnd, prt, value);
  }

  /*
   * (non-Javadoc)
   * @see net.java.slee.resource.diameter.slh.events.avp.SupportedFeaturesAvp#getFeatureList()
   */
  public long getFeatureList() {
    return getAvpAsUnsigned32(LCSRoutingInfoAVPCodes.FEATURE_LIST, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  /*
   * (non-Javadoc)
   * @see net.java.slee.resource.diameter.slh.events.avp.SupportedFeaturesAvp#hasFeatureList()
   */
  public boolean hasFeatureList() {
    return hasAvp(LCSRoutingInfoAVPCodes.FEATURE_LIST, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  /*
   * (non-Javadoc)
   * @see net.java.slee.resource.diameter.slh.events.avp.SupportedFeaturesAvp#setFeatureList(long)
   */
  public void setFeatureList(long featureList) {
    addAvp(LCSRoutingInfoAVPCodes.FEATURE_LIST, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, featureList);
  }

  /*
   * (non-Javadoc)
   * @see net.java.slee.resource.diameter.slh.events.avp.SupportedFeaturesAvp#getFeatureListId()
   */
  public long getFeatureListId() {
    return getAvpAsUnsigned32(LCSRoutingInfoAVPCodes.FEATURE_LIST_ID, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  /*
   * (non-Javadoc)
   * @see net.java.slee.resource.diameter.slh.events.avp.SupportedFeaturesAvp#hasFeatureListId()
   */
  public boolean hasFeatureListId() {
    return hasAvp(LCSRoutingInfoAVPCodes.FEATURE_LIST_ID, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID);
  }

  /*
   * (non-Javadoc)
   * @see net.java.slee.resource.diameter.slh.events.avp.SupportedFeaturesAvp#setFeatureListId(long)
   */
  public void setFeatureListId(long featureListId) {
    addAvp(LCSRoutingInfoAVPCodes.FEATURE_LIST_ID, LCSRoutingInfoAVPCodes.SLh_VENDOR_ID, featureListId);
  }

  /*
   * (non-Javadoc)
   * @see net.java.slee.resource.diameter.slh.events.avp.SupportedFeaturesAvp#hasVendorId()
   */
  public boolean hasVendorId() {
    return hasAvp(Avp.VENDOR_ID);
  }

  /*
   * (non-Javadoc)
   * @see net.java.slee.resource.diameter.slh.events.avp.SupportedFeaturesAvp#setVendorId(long)
   */
  public void setVendorId(long vendorId) {
    addAvp(Avp.VENDOR_ID, vendorId);
  }

}
