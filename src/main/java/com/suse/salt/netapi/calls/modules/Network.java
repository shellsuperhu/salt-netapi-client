package com.suse.salt.netapi.calls.modules;

import com.suse.salt.netapi.calls.LocalCall;

import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * salt.modules.network
 */
public class Network {

    private Network() { }

    /**
     * Network interface as returned by "network.interfaces".
     */
    public static class Interface {

        private String hwaddr;
        private boolean up;
        private List<INet> inet;
        private List<INet6> inet6;

        /**
         * @return the hwaddr
         */
        public String getHWAddr() {
            return hwaddr;
        }

        /**
         * @return the up
         */
        public boolean isUp() {
            return up;
        }

        /**
         * @return the inet
         */
        public List<INet> getInet() {
            return inet;
        }

        /**
         * @return the inet6
         */
        public List<INet6> getInet6() {
            return inet6;
        }
    }

    /**
     * Network interface as returned by "network.interfaces".
     */
    public static class INet {

        private String broadcast;
        private String netmask;
        private String label;
        private String address;

        /**
         * @return the broadcast
         */
        public String getBroadcast() {
            return broadcast;
        }

        /**
         * @return the netmask
         */
        public String getNetmask() {
            return netmask;
        }

        /**
         * @return the label
         */
        public String getLabel() {
            return label;
        }

        /**
         * @return the address
         */
        public String getAddress() {
            return address;
        }
    }

    /**
     * Network interface (IPv6) as returned by "network.interfaces".
     */
    public static class INet6 {

        private String prefixlen;
        private String address;
        private String scope;

        /**
         * @return the prefixlen
         */
        public String getPrefixlen() {
            return prefixlen;
        }

        /**
         * @return the address
         */
        public String getAddress() {
            return address;
        }

        /**
         * @return the scope
         */
        public String getScope() {
            return scope;
        }
    }

    public static LocalCall<Map<String, Interface>> interfaces() {
        return new LocalCall<>("network.interfaces", Optional.empty(), Optional.empty(),
                new TypeToken<Map<String, Interface>>(){});
    }
}
