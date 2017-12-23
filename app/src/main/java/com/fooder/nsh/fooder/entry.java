package com.fooder.nsh.fooder;

/**
 * Created by this-is-nsh on 12/12/17.
 */

public class entry {

        public String name;
        public String order;
        public int phone;

        public  entry ( )
        {

        }

        public entry (String name, String order, int phone) {
            this.name= name;
            this.order= order;
            this.phone=phone;
        }

        public String getName()
        {
            return name;
        }
        public String getOrder()
        {
            return order;
        }
        public int getPhone()
        {
            return phone;
        }
    }

