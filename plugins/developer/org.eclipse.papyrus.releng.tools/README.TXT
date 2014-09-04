This plug-in contains a tool to update a Buckminster rmap (XML file) from a B3 build model.
The rmap is updated using comments in the XML that reference the model elements from which 
the update sites must be copied.
These comments must appear before each "rm:uri" element which must be updated automatically, like this:
  <!-- updateFrom("Eclipse", 0) -->
  <rm:uri format="http://download.eclipse.org/eclipse/updates/4.2milestones/S-4.2M3-201110281100"/>

The first parameter in updateFrom is the label of a contribution, which you can find in the b3aggrcon files:
 <aggregator:Contribution ... label="xxx">

The second parameter is the index of the "repositories" element that must be used 
(in case there are several update sites defined on one contribution).

To update the map once these comments are written, right-click on an rmap file 
and choose "Update RMap From Aggregation Build Model".
Then choose from which b3aggr file (aggregation build model) the map must be updated.
The b3aggr file must be at the root of a project in your workspace : 
checkout one of the "org.eclipse.<releaseName>.build" projects from CVS "dev.eclipse.org:/cvsroot/callisto".