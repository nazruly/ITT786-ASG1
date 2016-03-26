#! /usr/bin/perl

use strict;
use warnings;
use Encode;

my $filename = "./NazrulYusni-perl.txt";

my $name = "Nazrul Yusni bin Hamzah\n";
my $address = "Seksyen U16 Shah Alam\n";

open(my $FH, '>', $filename) or die "Could not open file '$filename' $!";
print $FH $name;
print $FH $address;
close $FH;
