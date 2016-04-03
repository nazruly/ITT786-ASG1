#! /usr/bin/perl

use strict;
use warnings;
use Encode;

# Set output filename
my $filename = "./NazrulYusni-perl.txt";

# Set string value
my $name = "Nazrul Yusni bin Hamzah\n";
my $address = "Seksyen U16 Shah Alam\n";

# open file into FH handler
open(my $FH, '>', $filename) or die "Could not open file '$filename' $!";
# write data into FH handler
print $FH $name;
print $FH $address;

# commit write
close $FH;
